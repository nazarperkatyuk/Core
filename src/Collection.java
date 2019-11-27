public class Collection {

    private static Number[] numbers;


    public Collection(Number[] numbers) {
        this.numbers = numbers;
    }

    public class class_1 implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < numbers.length;

        }

        @Override
        public Number next() {
            return numbers[index++];
        }
    }

    public class class_2 implements Iterator {
        int index = numbers.length -1;
        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Number next() {
            index = index - 2;
            return numbers[index + 2];
        }
    }

    public Iterator create1() {
        return new class_1();
    }

    public Iterator create2() {
        return new class_2();
    }

        public Iterator create_Anonim () {
            return new Iterator() {
                int index = numbers.length -1;

                @Override
                public boolean hasNext() {
                    return index >=-0;
                }

                @Override
                public Number next() {
                    index = index - 3;
                    return numbers[index +3];

                }
            };
        }
        public Iterator create_Local(){
        class class_4 implements Iterator{

            int index = 0;

            @Override
            public boolean hasNext() {
                return index< numbers.length;
            }

            @Override
            public Number next() {
                int q = index;
                index =  index + 5;
                int num =(int) numbers[q];
                if (num % 2 == 0) {
                    return num -=100;
                }else {
                    return num;
                }
            }
        }
        return new class_4();
        }



 }


