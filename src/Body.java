public class Body {

        private int length;
        private int width;
        private String color;

        public Body (String color, int length, int width){
            this.length = length;
            this.width = width;
            this.color=color;
        }
        public Body(){}

        public int getLength() {
            return length;
        }
        public void setLength(int length) {
                this.length = length;
        }

        public int getWidth(){
            return width;
        }
        public void setWidth(int width) {
            this.width = width;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return "Body{" + "length = " + length +
                    ", width = " + width +
                    ", color = " + color + '}';
        }

    public void body_width(int width){
        this.width+=width;
    }

    public void body_length(int length){
        this.length+=length;
        }
}
