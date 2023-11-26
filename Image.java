import java.util.concurrent.TimeUnit;

class Image implements Element {
    private String url;
    private boolean isLoaded = false;

    public Image(String url) {
        this.url = url;
        this.isLoaded = false;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        if (!isLoaded) {
            load();
        }
        System.out.println("Image: " + url);
    }
    
    private void load() {
        // Logica pentru încărcarea imaginii din fișier
        isLoaded = true;
    }
}