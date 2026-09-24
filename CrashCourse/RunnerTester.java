public class RunnerTester {
        public static void main(String[] args){
        Runner arben = new Runner("Arben", "Voorhees", 6,18.75);
        Runner joel = new Runner("Joel", "Voorhees", 6, 30);
        arben.train(10);
        arben.race();
        joel.rest();
        joel.transfer("North");
        joel.display();
    }
}