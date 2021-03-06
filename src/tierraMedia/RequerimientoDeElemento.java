package tierraMedia;

import java.util.stream.Collectors;

public class RequerimientoDeElemento extends Requerimiento {

    private String nombreElemento;

    public RequerimientoDeElemento(String nombreElemento, Integer cantidad) {
        super(cantidad);
        this.nombreElemento = nombreElemento;
    }


/*
    @Override
    public boolean unidadCumpleConLasNormas(Grupo grupo) {
        return grupo.getUnidades().stream()
                .filter(unidad -> unidad.getItems().containsKey(nombreElemento))
                .collect(Collectors.toList())
                .size() >= this.getCantidad();
    }
*/

    @Override
    public boolean unidadCumpleConLasNormas(Unidad unidad) {
        return unidad.getItems().containsKey(nombreElemento);
    }


}
