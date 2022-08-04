package interfaces_and_abstraction.car_shop_extend;

import java.io.Serializable;

public interface Car extends Serializable {
    public Integer tires = 4;
    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();
}
