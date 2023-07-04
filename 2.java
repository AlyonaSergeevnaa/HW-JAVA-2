/*2) Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

 public class HW-JAVA-2 {
 public static void main(String[] args) throws IOException  {

        int[] arr = new int[10];
        Random rand = new Random();
        int tmp = 0;
        Logger log = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("logger.log");
        log.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(11);
        }
            
        for (int j = 0; j < arr.length-1; j++) {
            for (int k = j+1; k < arr.length; k++) {
                if (arr[k]<arr[j]){
                    tmp = arr[j];
                    log.setLevel(Level.INFO);
                    arr[j] = arr[k];
                    arr[k] = tmp;
                    log.setLevel(Level.INFO);
                }
                String str = Arrays.toString(arr);
                System.out.println(str);
                log.log(Level.INFO, String.format(str));
    }
}
        System.out.println(Arrays.toString(arr));
        String str = Arrays.toString(arr);
        log.log(Level.INFO, String.format("Pезультат",str));
        
    }
}