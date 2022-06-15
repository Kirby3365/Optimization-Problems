class Main {  
  public static void main(String[] args) {
    //Clear the Console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    double[] firstArray = {1.5, 8.0, 9.9, 3.1, 11.2, 6.3};
    double[] secondArray = {33.1, 20.2, 8.3, 17.6, 5.5, 5.6};

    double numOutput = 0;
    double arrayNumOne = 0;
    double arrayNumTwo = 0;

    double operationNum = 0;

    //Product
    System.out.println("Finding biggest product...");
    System.out.println();

    for(int i = 0; i < firstArray.length; i++){
      for(int j = 0; j < secondArray.length; j++){
        operationNum = firstArray[i] * secondArray[j];
        if(operationNum > numOutput){
          numOutput = operationNum;
          arrayNumOne = firstArray[i];
          arrayNumTwo = secondArray[j];
        }
      }
    }
    
    System.out.println("First Number : " + arrayNumOne);
    System.out.println("Second Number : " + arrayNumTwo);
    System.out.println("Optimal Product : " + numOutput);
    System.out.println();
    System.out.println();

    
    //Subtraction
    System.out.println("Finding biggest number using subtraction...");
    System.out.println();

    numOutput = 0;
    arrayNumOne = 0;
    arrayNumTwo = 0;

    operationNum = 0;
    
    for(int i = 0; i < firstArray.length; i++){
      for(int j = 0; j < secondArray.length; j++){
        operationNum = firstArray[i] - secondArray[j];
        if(operationNum > numOutput){
          numOutput = operationNum;
          arrayNumOne = firstArray[i];
          arrayNumTwo = secondArray[j];
        }
      }
    }
    
    System.out.println("First Number : " + arrayNumOne);
    System.out.println("Second Number : " + arrayNumTwo);
    System.out.println("Biggest Number : " + numOutput);
    System.out.println();
    System.out.println();
    
    OptimizationProblem opProblems = new OptimizationProblem(firstArray, secondArray);
    OperationVariables opVars = opProblems.Optimization(OptimizationProblem.Operation.Multiplication);
    numOutput = opVars.numOutput;
    arrayNumOne = opVars.arrayNumOne;
    arrayNumTwo = opVars.arrayNumTwo;
    
    System.out.println("Finding biggest number using Multiplication...");
    System.out.println();
    System.out.println("First Number : " + arrayNumOne);
    System.out.println("Second Number : " + arrayNumTwo);
    System.out.println("Biggest Number : " + numOutput);
    System.out.println();
    System.out.println();
  }
}