package somepackage;


import somethinggreen.Contract;

public class Main {
    public static void main(String[] args) {
        Some some = new Some("Тестовый");
        System.out.printf(some.getSecret());
        System.out.println();

        Other.saySomthing();
        System.out.println();

        ContractImpl contractImpl = new ContractImpl();
        contractImpl.soTellMeAboutInterfaces();


    }
    public static class ContractImpl implements Contract {

        @Override
        public int count() {
            return 0;
        }
    }
}