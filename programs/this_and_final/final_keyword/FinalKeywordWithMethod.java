class Computer{

    void printComputerName(){
        System.out.println("Normal computer");
    }

    final void printHardDriveMemory(){
        System.out.println("Hard drive 500GB");
    }

}

class HpComputer extends Computer{
    void printComputerName(){
        System.out.println("HP computer");
    }
}

class FinalKeywordWithMethod{
    public static void main(String[] args) {
        HpComputer hpComputer = new HpComputer();
        hpComputer.printComputerName();
        hpComputer.printHardDriveMemory();
    }
}
