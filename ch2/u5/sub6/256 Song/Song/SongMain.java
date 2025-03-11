public class SongMain {
		public static void main(String[] args) {
				// Original two songs from the zip
				Song hit1 = new Song("Eagles", "Take it Easy", 3, 32);
				Song hit2 = new Song("David Bowie", "Heroes", 6, 12);
				
				// Adding two more songs
				Song hit3 = new Song("Lynyrd Skynyrd", "Free Bird", 9, 8);
				Song hit4 = new Song("C418", "Aria Math", 2, 47);

				// Print one, print all 
				System.out.println("Song 1: \n" + hit1);
				System.out.println();
				System.out.println("Song 2: \n" + hit2);
				System.out.println("-");
				System.out.println("Song 3: \n" + hit3);
				System.out.println();
				System.out.println("Song 4: \n" + hit4);
				System.out.println();
				
				// Compare songs to find the longest one
				Song longest = hit1; // set the current longest one to the first one to test the others next
				
				System.out.println("-----"); 
				System.out.println(); // Formatting :P
				if (hit2.betterSong(longest)) {
					longest = hit2;
				}
				if (hit3.betterSong(longest)) {
					longest = hit3;
				}
				if (hit4.betterSong(longest)) {
					longest = hit4;
				}
				
				System.out.println("The longest song is: " + "'" + longest.getSongTitle() + "'");
				System.out.println(longest);
		}
}