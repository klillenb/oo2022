public class Operations {
    public abstract class Operation {
        private final String title;

        Operation(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }

        abstract double operate(int a, int b);
    }

    public class OpAdd extends Operation {
        OpAdd() {
            super("+");
        }

        double operate(int a, int b) {
            return a + b;
        }
    }

    public class OpSub extends Operation {
        OpSub() {
            super("-");
        }

        double operate(int a, int b) {
            return a - b;
        }
    }

    public class OpMul extends Operation {
        OpMul() {
            super("*");
        }

        double operate(int a, int b) {
            return a * b;
        }
    }

    public class OpDiv extends Operation {
        OpDiv() {
            super("/");
        }

        double operate(int a, int b) {
            return (double) (a) / b;
        }
    }
}