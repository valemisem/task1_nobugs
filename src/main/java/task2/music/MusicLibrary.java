package task2.music;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MusicLibrary {

    private final Map<String, HashSet<MusicTrack>> musicLibrary = new HashMap<>();
    public void addMusicTrack(MusicTrack musicTrack) {
        musicLibrary.putIfAbsent(musicTrack.getGenre(), new HashSet<>());
        musicLibrary.get(musicTrack.getGenre())
                .add(musicTrack);
    }

    public void removeMusicTrack(MusicTrack musicTrack) {
        musicLibrary.get(musicTrack.getGenre()).remove(musicTrack);
    }

    public HashSet<String> getTracksByGenre(String genre) {
        HashSet<String> musicTrackNames = new HashSet<>();

        for (Map.Entry<String, HashSet<MusicTrack>> genreEntry : musicLibrary.entrySet()) {
            String genreInLibrary = genreEntry.getKey();

            if (genreInLibrary.equals(genre)) {
                HashSet<MusicTrack> musicTracks = genreEntry.getValue();

                for (MusicTrack musicTrack : musicTracks) {
                    musicTrackNames.add(musicTrack.getName());
                }

                return musicTrackNames;
            }
        }

        return musicTrackNames;
    }

    public void printTracksByGenre(String genre) {

        HashSet<String> musicTrackNames = getTracksByGenre(genre);


        for (String musicTrackName : musicTrackNames) {
            System.out.println(musicTrackName);
        }
    }
}