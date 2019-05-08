package user.domain;

import backup.domain.Backup;
import common.domain.BaseDomain;
import user.Activity;

import java.util.List;

public class User extends BaseDomain {

    private String name;
    private Activity activity;
    private List<Backup> listOfBackups;

    public User(String name, Long id, Activity activity) {
        this.name = name;
        this.id = id;
        this.activity = activity;
    }

    public User(String name, Long id, Activity activity, List<Backup> listOfBackups) {
        this.id = id;
        this.name = name;
        this.activity = activity;
        this.listOfBackups = listOfBackups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Backup> getListOfBackups() {
        return listOfBackups;
    }

    public void setListOfBackups(List<Backup> listOfBackups) {
        this.listOfBackups = listOfBackups;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
