package InterfaceConcept;

@FunctionalInterface
interface I{
    void solution();//In Functional Interface we can have only one method.

}
interface II{
    void play();//In normal Interface we can have one or more methods.
    void show();
}
public class A {
    public static void main(String [] arg){
        //How we Call method of Functional Interface?-We can't make an object of Interface
        I obj=()-> System.out.println("Solution");
        obj.solution();

        //Call methods of Normal Interface:-[We can't make object of Interface]
        II obj1=new II(){
            public void play(){
                System.out.println("Play");
            }
            public void show(){
                System.out.println("Show");
            }
        };
        obj1.play();
        obj1.show();
    }
}
