package com.company;


class fclass1{
    public String fild1="fild1";
    protected String fild2="fild2";
        public static void main(String[] args) {
            //вызовем в обоих классах метод, который выведет значние унаследованного открытого поля класса-родителя
    new fclass3().test();
    new fclass2().test();
    //убедимся, что методы доступа для защищенного поля работают.
    fclas2task2 task2=new fclas2task2();
            System.out.println(task2.getFild2());
    task2.setFild2("new fild2!!!!!");
            System.out.println(task2.getFild2());

        }

}
class fclass2 extends fclass3{

}
class fclass3 extends fclass1{
    public void test(){
        System.out.println("Значение унаследоанного поля="+fild1);
    }
}
class fclas2task2 extends fclass1{

    public String getFild2(){
        return super.fild2;
    }
    public void setFild2(String string){
        super.fild2=string;
    }
}
