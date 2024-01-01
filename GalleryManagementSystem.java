import java.util.Scanner;

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