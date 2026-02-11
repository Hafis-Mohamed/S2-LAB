public class CPU {
    float prize;

    CPU(float prize) {
        this.prize = prize;
    }

    // Inner class
    public class processor {
        int no_of_cores;
        String manufacturer;

        processor(int n, String manu) {
            this.no_of_cores = n;
            this.manufacturer = manu;
        }

        void display() {
            System.out.println("Processor cores: " + no_of_cores);
            System.out.println("Processor manufacturer: " + manufacturer);
        }

        // Static nested class
        public static class RAM {
            int memory;
            String manufacturer;

            RAM(int memory, String manufacturer) {
                this.memory = memory;
                this.manufacturer = manufacturer;
            }

            void display() {
                System.out.println("RAM memory: " + memory + " GB");
                System.out.println("RAM manufacturer: " + manufacturer);
            }
        }
    }

    public static void main(String[] args) {

        CPU p1 = new CPU(2500000);

        CPU.processor p12 = p1.new processor(8, "AMD");

        CPU.processor.RAM p123 = new CPU.processor.RAM(16, "Samsung");

        System.out.println("CPU Price: " + p1.prize);
        p12.display();
        p123.display();
    }
}
