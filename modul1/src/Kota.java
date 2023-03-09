public class Kota<E> {
        private E element;

        public Kota(E kota){
            element = kota;
        }

        public E getElement(){
            return element;
        }

        public static void main(String[] args){
            Kota<Integer> jumKota = new Kota<Integer>(9);
            Kota<String> namaKota = new Kota<String>("Malang");
            System.out.println("Jumlah kota di Jawa Timur"+ jumKota.getElement() + "Kota");
            System.out.println("Salah satu Kota di Jawa Timur : Kota "+ namaKota.getElement());
        }
}