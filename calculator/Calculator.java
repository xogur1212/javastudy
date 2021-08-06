package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
   private JTextField resultTxt;
   private ArrayList<String> calculation = new ArrayList<String>(); 
   private String num="";
   private String prevOperation="";
   // Collection은 길이가 정해져 있지 않다   
   public Calculator() {
      
      Container contentPane = this.getContentPane(); // ctrl + shift + o
      contentPane.setBackground(Color.GRAY);//(new Color(r[256],g[256],b[256]));
      
      resultTxt = new JTextField();
      resultTxt.setBackground(Color.WHITE);
      resultTxt.setFont(new Font("맑은 고딕",Font.BOLD,40));
      resultTxt.setHorizontalAlignment(JTextField.RIGHT);
      resultTxt.setEditable(false); // 글 수정안되게 막기....
      //resultTxt.setSize(400,200);
      resultTxt.setPreferredSize(new Dimension(400,80));//
      
      JPanel btnPanel = new JPanel();// JButton을 담을 container 역할 
     btnPanel.setLayout(new GridLayout(4,4,2,2)); // 4줄에 4칸 2,2
      
      contentPane.add(resultTxt,BorderLayout.NORTH);
      contentPane.add(btnPanel,BorderLayout.SOUTH);
      
      // 버튼들을 한번에 제어하기 위한 배열을 하나 만듬...
      JButton btns[] = new JButton[16];
      String numberAndOperator[] = {"C","÷","×","=","7","8","9","+","4","5","6","-","1","2","3","0"};
      for(int i=0;i<16;i++) {
         btns[i] = new JButton(numberAndOperator[i]);
         btns[i].setFont(new Font("맑은 고딕",Font.BOLD,24));
         btns[i].setForeground(Color.WHITE);		//전경색
         btns[i].setBorderPainted(false);
         btns[i].setPreferredSize(new Dimension(80,80));
         btns[i].addActionListener(new BtnActionListener());
         btnPanel.add(btns[i]);
         if(i==0) {
            btns[i].setBackground(Color.RED);
         } else if(i==1 || i==2 || i==3 || i==7 || i==11) {
            btns[i].setBackground(Color.GRAY);
         } else {
            btns[i].setBackground(Color.BLACK);
         }
      }
      
      this.setTitle("계산기");
      this.setSize(400,500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);		//윈도우 창의 화면을 가운데로 한다.
      
      this.pack();  // 자식들의 크기에 맞춰서 줄이거나 늘리기... (껴맞추기)
      this.setVisible(true);
   }
   class BtnActionListener implements ActionListener  {
      @Override
      public void actionPerformed(ActionEvent e) {
         JButton clickedBtn = (JButton)e.getSource();// 이벤트가 발생된 오브젝트
         String operation = e.getActionCommand();	
         
         if(operation.equals("C")) {
            num="";
            resultTxt.setText("");
         } else if(operation.equals("=")) {
            //여기서 계산 결과 반환
            //문자를 쪼개서 숫자인지 연산자인지....
            String result = Double.toString( calcurate(resultTxt.getText()) );
            resultTxt.setText(result);
         } else if( operation.equals("+") || operation.equals("-") || operation.equals("×") || operation.equals("÷") ) {
            // 아무것도 없을때 음수 누르기.....
            if( resultTxt.getText().equals("") && operation.equals("-") ) {
               resultTxt.setText(resultTxt.getText()+operation);
            } else if (!resultTxt.getText().equals("") && 
                     !prevOperation.equals("+") && 
                     !prevOperation.equals("-") && 
                     !prevOperation.equals("×") &&
                     !prevOperation.equals("÷")
                     ) {
               resultTxt.setText(resultTxt.getText()+operation);
            } 
         } else {
            resultTxt.setText( resultTxt.getText()+operation );
         }
         //String operation = clickedBtn.getText().trim();
         prevOperation = operation;
      }
   }
   //연산자는 한번만 누르게 처리 한번
   
   // 매개변수로 전달받은 글자를 숫자와 연산자로 분리해서 calculation에 밀어넣기...
   private void resultTxtParsing(String tempTxt) {
      calculation.clear();
      for(int i = 0;i<tempTxt.length();i++) {
         char ch = tempTxt.charAt(i);
         if(ch=='÷' || ch=='×' || ch=='+' || ch=='-') {
            // 연산자일때
            calculation.add(num);
            num="";
            calculation.add(ch+"");
         } else {
            num+=ch;
         }
      }
      calculation.add(num);
      calculation.remove("");
      num="";
      System.out.println(calculation.toString());
   }
   
   private double calcurate(String tempTxt) {
      //반복문 돌리기...
      String mode = "";
      double prevNum = 0;
      double currentNum = 0;
      resultTxtParsing(resultTxt.getText());
      //뺑뺑이 돌다가 +,-,×,÷
      //10+3+3+10+5  (10,+,3,+,3,+10,+,5)
      for(int i=0; i<calculation.size();i++) {
    	  String str= calculation.get(i);
          if(str.equals("+")) {
             mode = "plus";
          } else if(str.equals("-")) {
             mode = "minus";
          } else if(str.equals("×")) {
             mode = "multiply";
          } else if(str.equals("÷")) {
             mode = "divide";
          } else {
        	  //mode가 multiply가 아니고
        	  if((mode.equals("multiply") ||  mode.equals("divide")) &&  !str.equals("+")  && !str.equals("-") && !str.equals("x") 
        			 &&  !str.equals("÷")	) {
        		  Double first =Double.parseDouble(calculation.get(i-2));
        		  Double second =Double.parseDouble(calculation.get(i));
        		  Double result =0.0;
        		  if(mode.equals("multiply")) {
        			  result= first*second;
        			  System.out.println(result);
        		  }else if(mode.equals("divide")) {
        			  result= first/second;
        			  System.out.println(first+result);
        		  }
        		  
        		  System.out.println("result ===" +result);
        		  calculation.add(i+1,Double.toString(result));
        		  //[3,+,5,*,8,40]
        		  //
         		  // 0 1 2 3 4] 
        		  // 3 + * 8
        		  
        		  
        		  for(int j=0;j<3;j++) {
        			  calculation.remove(i-2);
        			//  System.out.println(calculation);
        		  }
        		  i-=2;
        	  }
       }
       
      
      }
      for(String str : calculation) {
         if(str.equals("+")) {
            mode = "plus";
         } else if(str.equals("-")) {
            mode = "minus";
         }  else {
            //연산자가 아니라면....숫자라면
            currentNum = Double.parseDouble(str);   //문자열을 double로 바꾼다.
            if(mode.equals("plus")) {
               prevNum+=currentNum;
            } else if(mode.equals("minus")) {
               prevNum-=currentNum;
            } else {
               prevNum = currentNum;
            }
         } 
      }
      System.out.println(prevNum);
      return prevNum;
   }
   
   
   
   //resultTxtParsing("10+10+10");
   
   public static void main(String[] args) {
      new Calculator();
   }
}








