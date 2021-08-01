class ComputerC{

    void printComputerName(){
        System.out.println("Normal computer");
    }

    final void printHardDriveMemory(){
        System.out.println("Hard drive 500GB");
    }

}

final class HpComputerC extends ComputerC{
    void printComputerName(){
        System.out.println("HP computer");
    }
}

class DellComputer extends HpComputerC{

}

class FinalKeywordWithClass{
    public static void main(String[] args) {
        HpComputerC hpComputer = new HpComputerC();
        hpComputer.printComputerName();
        hpComputer.printHardDriveMemory();
    }
}
