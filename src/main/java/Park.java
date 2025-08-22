public class Park {

    public static class Attractions{
        public String nameAttractions;
        public String time;
        public int cost;

        public Attractions(String nameAttractions, String time, int cost) {
            this.nameAttractions = nameAttractions;
            this.time = time;
            this.cost = cost;
        }

        public String getNameAttractions() {
            return nameAttractions;
        }

        public String getTime() {
            return time;
        }

        public int getCost() {
            return cost;
        }

        public void setNameAttractions(String nameAttractions) {
            this.nameAttractions = nameAttractions;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
}