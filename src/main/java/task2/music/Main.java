package task2.music;

public class Main {
    public static void main(String[] args) {

        MusicLibrary musicLibrary = new MusicLibrary();
        MusicTrack song1 = new MusicTrack("song_1", "artist1", "genre1");
        MusicTrack song2 = new MusicTrack("song_2", "artist2", "genre2");
        MusicTrack song3 = new MusicTrack("song_3", "artist3", "genre1");

        musicLibrary.addMusicTrack(song1);
        musicLibrary.addMusicTrack(song2);
        musicLibrary.addMusicTrack(song3);


        System.out.println("GENRE_1:");
        musicLibrary.printTracksByGenre("genre1");

        musicLibrary.removeMusicTrack(song1);

        System.out.println("Tracks remaining from genre1 after removing a song:");
        musicLibrary.printTracksByGenre("genre1");
    }
}
