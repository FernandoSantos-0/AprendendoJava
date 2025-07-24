package progamasDasAulasOrientadasAObjetos.enumeracao.exercicio02.entities;

import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio02.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> request = new ArrayList<>();
    private Client client;

    public Order (){
    }

    public Order(Date moment, OrderStatus status,Client client) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getRequest() {
        return request;
    }

    public void addItem(OrderItem order){
        request.add(order);
    }

    public void removeItem(OrderItem order){
        request.remove(order);
    }

    public Double total(){
        Double sum = 0.0;
        for(OrderItem requests:request){
            sum += requests.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : request) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
