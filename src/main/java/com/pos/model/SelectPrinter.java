package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.StringJoiner;

@Entity
@Table(name = "select_printer")
public class SelectPrinter {

    @Id
    Integer selectPrinterId;
    String printerName;
    Boolean isSelected;

    public Integer getSelectPrinterId() {
        return selectPrinterId;
    }

    public void setSelectPrinterId(Integer selectPrinterId) {
        this.selectPrinterId = selectPrinterId;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SelectPrinter.class.getSimpleName() + "[", "]")
                .add("selectPrinterId=" + selectPrinterId)
                .add("printerName='" + printerName + "'")
                .add("isSelected=" + isSelected)
                .toString();
    }
}
