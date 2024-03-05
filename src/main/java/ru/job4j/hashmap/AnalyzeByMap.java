package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int average = 0;
        int i = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                average += subject.score();
                i += 1;
            }
        }
        return (double) average / i;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int average = 0;
            int i = 0;
            for (Subject subject : pupil.subjects()) {
                average += subject.score();
                i += 1;
            }
            Label label = new Label(pupil.name(), (double) average / i);
            list.add(label);
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
                /*if (map.get(subject.name()) == null) {
                    map.put(subject.name(), subject.score());
                } else {
                    map.put(subject.name(), map.get(subject.name()) + subject.score());
                }*/
            }
        }
        List<Label> list = new ArrayList<>();
        for (String key : map.keySet()) {
            Label label = new Label(key, (double) map.get(key) / map.size());
            list.add(label);
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int average = 0;
            for (Subject subject : pupil.subjects()) {
                average += subject.score();
            }
            Label label = new Label(pupil.name(), average);
            list.add(label);
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
                /*if (map.get(subject.name()) == null) {
                    map.put(subject.name(), subject.score());
                } else {
                    map.put(subject.name(), map.get(subject.name()) + subject.score());
                }*/
            }
        }
        List<Label> list = new ArrayList<>();
        for (String key : map.keySet()) {
            Label label = new Label(key, (double) map.get(key));
            list.add(label);
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}