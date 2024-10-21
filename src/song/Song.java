
package song;

// Kelas untuk merepresentasikan satu lagu
class Song {
    String title;
    Song next;

    // Konstruktor untuk menginisialisasi judul lagu
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

// Kelas untuk merepresentasikan playlist menggunakan linked list
class Playlist {
    private Song head;

    // Konstruktor untuk menginisialisasi playlist kosong
    public Playlist() {
        this.head = null;
    }

    // Metode untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;  // Jika playlist kosong, tambahkan sebagai lagu pertama
        } else {
            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;  // Menelusuri sampai lagu terakhir
            }
            temp.next = newSong;  // Menambahkan lagu baru di akhir playlist
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlistnya kosong.");
            return;
        }

        Song temp = head;
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.next;  // Menelusuri setiap lagu dalam playlist
        }
        System.out.println("End");
    }


// Main class untuk menjalankan program
 
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        // Menambahkan lagu ke playlist
        myPlaylist.addSong("Song 1");
        myPlaylist.addSong("Song 2");
        myPlaylist.addSong("Song 3");

        // Menampilkan daftar lagu dalam playlist
        System.out.println("Playlist:");
        myPlaylist.displayPlaylist();
    }
}
