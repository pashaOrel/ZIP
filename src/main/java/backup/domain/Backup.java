package backup.domain;

import common.domain.BaseDomain;

import java.io.File;

public class Backup extends BaseDomain {

    private File data;

    public Backup(Long id, File data) {
        this.id = id;
        this.data = data;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }


}
