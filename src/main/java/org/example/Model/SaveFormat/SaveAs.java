package org.example.Model.SaveFormat;

import java.util.List;

public interface SaveAs<T> {
    void saveAs(List<T> list, String path);
}
