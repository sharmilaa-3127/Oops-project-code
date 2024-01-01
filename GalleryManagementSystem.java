import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Artwork {
    private String title;
    private String artist;
    private double price;

    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }
}

class ArtGallery {
    private List<Artwork> artworks;

    public ArtGallery() {
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public List<Artwork> getAllArtworks() {
        return artworks;
    }
}

public class GalleryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArtGallery artGallery = new ArtGallery();

        while (true) {
            System.out.println("1. Add Artwork");
            System.out.println("2. View All Artworks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option.\n");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter artwork title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter artwork price: ");
                    double price;
                    try {
                        price = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input for price. Please enter a valid number.\n");
                        continue;
                    }

                    Artwork newArtwork = new Artwork(title, artist, price);
                    artGallery.addArtwork(newArtwork);
                    System.out.println("Artwork added successfully!\n");
                    break;

                case 2:
                    List<Artwork> allArtworks = artGallery.getAllArtworks();
                    System.out.println("All Artworks:");
                    for (Artwork artwork : allArtworks) {
                        System.out.println("Title: " + artwork.getTitle() + ", Artist: " + artwork.getArtist() + ", Price: $" + artwork.getPrice());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting the Gallery Management System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}
