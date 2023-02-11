
     class Horse extends Animals {
        private String name;
        private String colour;

        public void eat() {
            System.out.println(name + " eating grass");
        }

        public void play() {
            System.out.println(name + " play kok boru");
        }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getColour() {
             return colour;
         }

         public void setColour(String colour) {
             this.colour = colour;
         }

         public Horse(int speed, String name, String colour) {
            super(speed);
            this.name = name;

        }

         @Override
         public String
         toString() {
             return "Horse{" +
                     "name='" + name + '\'' +
                     ", colour='" + colour + '\'' +
                     '}';
         }
     }


