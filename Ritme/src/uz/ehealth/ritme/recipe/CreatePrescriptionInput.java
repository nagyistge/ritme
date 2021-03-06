package uz.ehealth.ritme.recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.ehealth.ritme.model.MedicatieVoorschriftItem;

import java.util.List;

/**
 * Created by bdcuyp0 on 24-3-2016.
 */
public class CreatePrescriptionInput {
    private List<MedicatieVoorschriftItem> items;

    public List<MedicatieVoorschriftItem> getItems() {
        return items;
    }

    public CreatePrescriptionInput( @JsonProperty("items")final List<MedicatieVoorschriftItem> items) {
        this.items = items;
    }
}
