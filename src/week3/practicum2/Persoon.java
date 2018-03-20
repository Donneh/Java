package week3.practicum2;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public boolean koop(Game g) {
        boolean owned = false;
        for (Game game : mijnGames) {
            if (game.equals(g)) {
                owned = true;
            }
        }
        if(budget >= g.huidigeWaarde() && !owned) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);

            return true;
        }

        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        boolean owned = false;
        for(Game game : mijnGames) {
            if (game.equals(g)) {
                owned = true;
            }
        }

        if (owned && koper.koop(g)) {
            mijnGames.remove(g);
            budget += g.huidigeWaarde();
            return true;
        }

        return false;
    }

    public Game zoekGameOpNaam(String title) {
        for (Game game : mijnGames) {
            if(game.getNaam().equals(title)) {
                return game;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(naam + " heeft een budget van " + budget + " en bezit de volgende games:");
        s.append(System.getProperty("line.separator"));
        for (Game game : mijnGames) {
            s.append(game).append(System.getProperty("line.separator"));
        }
        return s.toString();
    }

}
