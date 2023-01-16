package api.producto.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/producto")
@CrossOrigin({"*"})

public class ProductoController {
    @Autowired ProductoService productoService;

    @GetMapping("/")
    public List<Producto> findAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto findProductoById(@PathVariable Long id) {
        return productoService.findProductoById(id);
    }

    @PostMapping("/")
    public Producto saveProducto(@RequestBody Producto entityProducto) {
        return productoService.saveProducto(entityProducto);
    }

    @PutMapping("/")
    public Producto updateProducto(@RequestBody Producto entityProducto) {
        return productoService.saveProducto(entityProducto);
    }

    @DeleteMapping("/{id}")
    public void deleteProductoById(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }

}
