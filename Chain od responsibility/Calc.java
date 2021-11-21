public class Calc {

    public static void main(String[]args){
        Chain chain = new Chain();
        ChainEnd end = new ChainEnd();
        Handler addition = new Add();
        Handler subtraction = new Subtract();
        Handler multiplication = new Multiply();
        Handler division = new Divide();


        chain.setNext(addition);
        addition.setNext(subtraction);
        subtraction.setNext(multiplication);
        multiplication.setNext(division);
        division.setNext(end);


        Number request = new Number(460, 2, "multiply");
        addition.calculate(request);


    }
}
class Number{
    int number1;
    int number2;
    String calculation;
    public Number(int number1, int number2, String calculation){
        this.number1=number1;
        this.number2=number2;
        this.calculation=calculation;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculation() {
        return calculation;
    }
}
abstract class Handler{

    public abstract void setNext(Handler next);

    public abstract void calculate(Number request);

}
class Chain extends Handler {
    private Handler nextInChain;
    @Override
    public void setNext(Handler next) {
        nextInChain = next;
    }
    @Override
    public void calculate(Number request) {
        nextInChain.calculate(request);
    }
}
class ChainEnd extends Handler{

    @Override
    public void setNext(Handler next) {

    }

    @Override
    public void calculate(Number request) {
        System.out.print("Invalid calculation type. Try another one");

    }
}
class Add extends Handler{
private Handler nextInChain;
    @Override
    public void setNext(Handler next) {
        nextInChain = next;
    }
    @Override
    public void calculate(Number request) {
        if(request.getCalculation().equals("add")){
            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}
class Subtract extends Handler{
    private Handler nextInChain;
    @Override
    public void setNext(Handler next) {
        nextInChain = next;
    }
    @Override
    public void calculate(Number request) {
        if(request.getCalculation().equals("subtract")){
            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "+
                    (request.getNumber1()-request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}
class Multiply extends Handler{
    private Handler nextInChain;
    @Override
    public void setNext(Handler next) {
        nextInChain = next;
    }
    @Override
    public void calculate(Number request) {
        if(request.getCalculation().equals("multiply")){
            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
                    (request.getNumber1()*request.getNumber2()));

        } else {
            nextInChain.calculate(request);
        }
    }

}
class Divide extends Handler{
    private Handler nextInChain;
    @Override
    public void setNext(Handler next) {
        nextInChain = next;
    }
    @Override
    public void calculate(Number request) {
        if(request.getCalculation().equals("divide")){
            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
                    (request.getNumber1()/request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}