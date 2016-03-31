package com.kronos.parent;

import ilog.concert.*;
import ilog.cplex.*;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launching the model1 method
		 System.out.println("Second Cplex Project");
		 model1(3,5);
		 
	}
	
	public static int model1(int a, int b) {
		try{
		
			IloCplex cplex = new IloCplex();
			//variables
			// Defining mathmatics variables
			//To x and y
			IloNumVar x = cplex.numVar(0,Double.MAX_VALUE,"x");
			IloNumVar y = cplex.numVar(0,Double.MAX_VALUE,"y");
			
			IloLinearNumExpr objective = cplex.linearNumExpr();
			//Define objective 0.12x + 0.15y
			objective.addTerm(0.12, x);
			objective.addTerm(0.15, y);
			
			//add objective
			//The goal is to minimize
			cplex.addMinimize(objective);
	 	//define constraints
			//writing constraints
			//writing constraints
			cplex.addGe(cplex.sum(cplex.prod(60,x),cplex.prod(60,y) ), 300);
			cplex.addGe(cplex.sum(cplex.prod(12,x),cplex.prod(6,y) ), 36);
			cplex.addGe(cplex.sum(cplex.prod(10,x),cplex.prod(30,y) ), 90);
			
			if(cplex.solve())
			{
				System.out.println("obj " +cplex.getObjValue());
			    System.out.println("x " +cplex.getValue(x));
			    System.out.println("y " +cplex.getValue(y));  
		    }
			
			
			else
			{System.out.println("Something goes wrong");}}
		
			
				catch (IloException exc)
		{ exc.printStackTrace();
		}
		
		return a+b;
		
	}
	
	
	}


