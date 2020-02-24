package main;


    class Encapsulation{
        private int ssn;

        public int getEmp_ssn(){
            return ssn;
        }
        public void setEmp_ssn(int NewValue){
            ssn=NewValue;
        }


        class Main {
            public  void main(String[] args) {
                Encapsulation obj = new Encapsulation();

                obj.setEmp_ssn(112233);

                System.out.println("Employee SSN: " + obj.getEmp_ssn());


            }
        }
}
