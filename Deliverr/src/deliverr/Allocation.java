/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverr;

/**
 * com.deliverr.Allocation represents our allocating result. One com.deliverr.Allocation corresponds to a com.deliverr.Warehouse,
 * since an com.deliverr.Allocation object represent our allocation strategy for the corresponding com.deliverr.Warehouse.
 * Since it's basically identical to the com.deliverr.Warehouse class, we simply extend the com.deliverr.Warehouse class.
 */
public class Allocation extends Warehouse {
    public Allocation(String name) {
        super(name);
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}