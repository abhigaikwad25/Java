class Parent{

}

class ChildA extends Parent{

}

class SubChildA extends ChildA{

}

class SubChildB extends ChildA{

}

class ChildB extends Parent{

}


class SubChildC extends ChildB{

}

class SubChildD extends ChildB{

}

class DownCasting{
    public static void main(String[] args){
        ChildA obj1=new ChildA();
        Parent obj2=new Parent();

        ChildA ob1=(SubChildA) obj1;
        SubChildB ob2=(SubChildB) ob1;
    }
}
