package com.example.rizkifr.myrecyclerview;

import java.util.ArrayList;


public class MovieData {
    public static String[][] data = new String [][]{
            {"The Avenger",
                    "2012",
                    "https://upload.wikimedia.org/wikipedia/en/f/f9/TheAvengers2012Poster.jpg"
            ,"When Thor's evil brother, Loki (Tom Hiddleston), gains access to the unlimited power of the energy cube called the Tesseract, Nick Fury (Samuel L. Jackson), director of S.H.I.E.L.D., initiates a superhero recruitment effort to defeat the unprecedented threat to Earth. Joining Fury's \"dream team\" are Iron Man (Robert Downey Jr.), Captain America (Chris Evans), the Hulk (Mark Ruffalo), Thor (Chris Hemsworth), the Black Widow (Scarlett Johansson) and Hawkeye (Jeremy Renner)"},
            {"Avengers: Age of Ultron",
                    "2015",
                    "https://upload.wikimedia.org/wikipedia/en/f/ff/Avengers_Age_of_Ultron_poster.jpg",
            "When Tony Stark (Robert Downey Jr.) jump-starts a dormant peacekeeping program, things go terribly awry, forcing him, Thor (Chris Hemsworth), the Incredible Hulk (Mark Ruffalo) and the rest of the Avengers to reassemble. As the fate of Earth hangs in the balance, the team is put to the ultimate test as they battle Ultron, a technological terror hell-bent on human extinction. Along the way, they encounter two mysterious and powerful newcomers, Pietro and Wanda Maximoff."},
            {"Avengers: Infinity War",
                    "2018",
                    "https://upload.wikimedia.org/wikipedia/en/4/4d/Avengers_Infinity_War_poster.jpg"
            ,"Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment."},
            {"Captain America",
                    "2011", "https://upload.wikimedia.org/wikipedia/en/9/91/CaptainAmerica109.jpg"
            ,"Captain America is a fictional superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 from Timely Comics, a predecessor of Marvel Comics."},
            {"Captain Amerika The winter Soldier",
                    "2014",
                    "https://upload.wikimedia.org/wikipedia/en/e/e8/Captain_America_The_Winter_Soldier.jpg",
            "\n" +
                    "After the cataclysmic events in New York with his fellow Avengers, Steve Rogers, aka Captain America (Chris Evans), lives in the nation's capital as he tries to adjust to modern times. An attack on a S.H.I.E.L.D. colleague throws Rogers into a web of intrigue that places the whole world at risk. Joining forces with the Black Widow (Scarlett Johansson) and a new ally, the Falcon, Rogers struggles to expose an ever-widening conspiracy, but he and his team soon come up against an unexpected enemy"},
            {"Iron Man",
                    "2008", "https://upload.wikimedia.org/wikipedia/en/thumb/e/e0/Iron_Man_bleeding_edge.jpg/250px-Iron_Man_bleeding_edge.jpg"
            ,"Anthony Edward Stark is a character portrayed by Robert Downey Jr. in the Marvel Cinematic Universe film franchise, based on the Marvel Comics character of the same name and known commonly by his alter ego, Iron Man"},
            {"Iron Man 2", "2010", "https://upload.wikimedia.org/wikipedia/en/e/ed/Iron_Man_2_poster.jpg"
            ,"With the world now aware that he is Iron Man, billionaire inventor Tony Stark (Robert Downey Jr.) faces pressure from all sides to share his technology with the military. He is reluctant to divulge the secrets of his armored suit, fearing the information will fall into the wrong hands. With Pepper Potts (Gwyneth Paltrow) and \"Rhodey\" Rhodes (Don Cheadle) by his side, Tony must forge new alliances and confront a powerful new enemy."}
    };

    public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (int i=0; i <data.length; i++){
            movie = new Movie();
            movie.setName(data[i][0]);
            movie.setRemarks(data[i][1]);
            movie.setPhoto(data[i][2]);
            movie.setDetail(data[i][3]);
            list.add(movie);
        }
        return list;
    }
}
