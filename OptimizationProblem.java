class OptimizationProblem{
  double[] firstArray = {1.5, 8.0, 9.9, 3.1, 11.2, 6.3};
  double[] secondArray = {33.1, 20.2, 8.3, 17.6, 5.5, 5.6};

  double operationNum = 0;

  OperationVariables opVars = new OperationVariables();

  OptimizationProblem(double[] arrOne, double[] arrTwo){
    firstArray = arrOne;
    secondArray = arrTwo;
  }

  public OperationVariables Optimization(Operation op){
    operationNum = 0;
    
    for(int i = 0; i < firstArray.length; i++){
      for(int j = 0; j < secondArray.length; j++){
        operationNum = GetEquation(op, i, j);
        if(operationNum > opVars.numOutput){
          opVars.numOutput = operationNum;
          opVars.arrayNumOne = firstArray[i];
          opVars.arrayNumTwo = secondArray[j];
        }
      }
    }

    return opVars;
  }

  double GetEquation(Operation op, int i, int j){
    switch(op){
      case Addition:
        return firstArray[i] + secondArray[j];
      case Subtraction:
        return firstArray[i] - secondArray[j];
      case Multiplication:
        return firstArray[i] * secondArray[j];
      case Division:
        return firstArray[i] / secondArray[j];
      default:
        return 0.0;
    }
  }

  public enum Operation {
    Addition,
    Subtraction,
    Multiplication,
    Division
  }
}