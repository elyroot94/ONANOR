package mr.onanor.application.views.nouveaubonddecommande;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;
import java.util.ArrayList;
import java.util.List;
import mr.onanor.application.components.pricefield.PriceField;

@PageTitle("Nouveau Bond de Commande")
@Menu(icon = "line-awesome/svg/file-invoice-dollar-solid.svg", order = 1)
@Route("")
@PermitAll
public class NouveauBonddeCommandeView extends Composite<VerticalLayout> {

    public NouveauBonddeCommandeView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField3 = new TextField();
        Button buttonSecondary = new Button();
        NumberField numberField = new NumberField();
        TextArea textArea = new TextArea();
        PriceField price = new PriceField();
        MultiSelectListBox textItems = new MultiSelectListBox();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Bond de Commande");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Fournisseur");
        textField2.setLabel("Cde Budgétaire");
        datePicker.setLabel("Date");
        textField3.setLabel("Signateur");
        textField3.setWidth("min-content");
        buttonSecondary.setText("Ajouter");
        buttonSecondary.setWidth("min-content");
        buttonSecondary.setMinWidth("10px");
        buttonSecondary.setMaxWidth("70px");
        numberField.setLabel("Quantité");
        numberField.setWidth("min-content");
        numberField.setMinWidth("20px");
        numberField.setMaxWidth("70px");
        textArea.setLabel("Désignation");
        textArea.setWidth("200px");
        textArea.setMinWidth("200px");
        textArea.setMaxWidth("150px");
        price.setLabel("Prix");
        price.setWidth("min-content");
        price.setMinWidth("20px");
        price.setMaxWidth("70px");
        textItems.setWidth("min-content");
        setMultiSelectListBoxSampleData(textItems);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Enreigistrer");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary2.setText("Annuler");
        buttonSecondary2.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(textField3);
        formLayout2Col.add(buttonSecondary);
        formLayout2Col.add(numberField);
        formLayout2Col.add(textArea);
        formLayout2Col.add(price);
        formLayout2Col.add(textItems);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary2);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setMultiSelectListBoxSampleData(MultiSelectListBox multiSelectListBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectListBox.setItems(sampleItems);
        multiSelectListBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
        multiSelectListBox.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }
}
