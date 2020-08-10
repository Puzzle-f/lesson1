package lesson7;

public class Plate {

        private int food;
        private int portion = 100;
        private int calculator=0;

        public Plate(int food) {
            this.food = food;
        }

        public int getFood() {
            return food;
        }

        public boolean decreaseFood(int amount) {
            if (food >= amount) {
                food -= amount;
                calculator += amount;
                System.out.println("съедено корма " + calculator);
                return true;
            } else {
                System.out.println("И поесть-то нечего");
                add();
                return false;
            }
        }
        public int add(){
              return   food += portion;
        }

        @Override
        public String toString() {
            return "Plate{" +
                    "food=" + food +
                    '}';
        }
    }


