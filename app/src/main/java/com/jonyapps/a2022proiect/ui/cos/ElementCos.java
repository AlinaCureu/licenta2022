package com.jonyapps.a2022proiect.ui.cos;

import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.jonyapps.a2022proiect.ui.MicdejunModel;

public class ElementCos {

    private MicdejunModel product;
    private int quantity;

    public ElementCos(MicdejunModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public MicdejunModel getProduct() {
        return product;
    }

    public void setProduct(MicdejunModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementCos cartItem = (ElementCos) o;
        return getQuantity() == cartItem.getQuantity() &&
                getProduct().equals(cartItem.getProduct());
    }

    public static void getSelectedSpinnerValue(Spinner spinner, int quantity) {
        spinner.setSelection(quantity - 1, true);
    }

    public static DiffUtil.ItemCallback<ElementCos> itemCallback = new DiffUtil.ItemCallback<ElementCos>() {
        @Override
        public boolean areItemsTheSame(@NonNull ElementCos oldItem, @NonNull ElementCos newItem) {
            return oldItem.getQuantity() == newItem.getQuantity();
        }

        @Override
        public boolean areContentsTheSame(@NonNull ElementCos oldItem, @NonNull ElementCos newItem) {
            return oldItem.equals(newItem);
        }
    };

}
