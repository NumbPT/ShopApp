package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SProdutos;


@WebServlet("/HProduto")
public class HProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private SProdutos servProdutos;
       
 
    public HProduto() {
        super();
        

        
        servProdutos = new SProdutos();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("listaProdutos", servProdutos.getArProdutos());
		
		
		request.getRequestDispatcher("produtos.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String nome = request.getParameter("nome");
		String qtd = request.getParameter("qtd");
			int iqtd = Integer.valueOf(qtd);
		String prec = request.getParameter("preco");
			double dprec = Double.valueOf(prec);
			
		servProdutos.addProduto(nome,iqtd,dprec);
		
		doGet(request, response);
		
		
		
	}

}
