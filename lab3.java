public class lab3 {
    public static void main(String[] args) throws Exception {
        long  endTime;
        long startTime = System.currentTimeMillis();

        //Crearea secțiunilor cu ImageProxy în loc de Image direct
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");

        //Adăugarea de ImageProxy în secțiuni
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);

        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);

        //Crearea cărții și adăugarea secțiunilor la carte
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);

        //Măsurarea timpului pentru crearea conținutului
        endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");

        //Măsurarea timpului pentru tipărirea secțiunii 1
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");
    }
}
