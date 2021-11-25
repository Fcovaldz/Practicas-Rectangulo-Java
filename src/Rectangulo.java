public class Rectangulo {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int radioDeEsquina;

    private Rectangulo(Builder builder){
        x = builder.x;
        y = builder.y;
        ancho = builder.ancho;
        alto = builder.alto;
        radioDeEsquina = builder.radioDeEsquina;
    }

    public static class Builder {
        private int x = 0;
        private int y = 0;
        private int ancho;
        private int alto;
        private int radioDeEsquina = 0;

        public Builder(int ancho, int alto){
            this.ancho = ancho;
            this.alto = alto;
        }

        public Rectangulo build(){
            return new Rectangulo(this);
        }

        public Builder x(int valor){
            x = valor;
            return this;
        }
        public Builder y(int valor){
            y = valor;
            return this;
        }
        public Builder ancho(int valor){
            ancho = valor;
            return this;
        }
        public Builder alto(int valor){
            alto = valor;
            return this;
        }
        public Builder radioDeEsquina(int valor){
            radioDeEsquina = valor;
            return this;
        }
    }
}
