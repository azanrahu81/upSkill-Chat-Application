import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;

public class ChatApplication {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Chat Application");
        frame.setSize(400, 310);
        frame.setLayout(null); // Use null layout for absolute positioning

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        // Color c = new Color(0,255,255);
        
         Color c = new Color(255, 192, 203);
        

        // Set the background color of the frame
        frame.getContentPane().setBackground(c);


         JLabel l1=new JLabel("Chat Application",JLabel.CENTER);
         l1.setFont(new Font("Serif", Font.BOLD,27));
         l1.setBackground(Color.BLUE);
         l1.setBounds(50,5,300,30);
         frame.add(l1);

         JSeparator s=new JSeparator();
         s.setFont(new Font("Serif",Font.BOLD,30));
         s.setBounds(0,35,400,10);
         frame.add(s);
        // Create components
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false); // Chat area should not be editable by the user
        chatArea.setBounds(10, 40, 370, 190);

        JTextField messageField = new JTextField();
        messageField.setBounds(10, 240, 280, 30);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(300, 240, 80, 30);

        // Add components to frame
        frame.add(chatArea);
        frame.add(messageField);
        frame.add(sendButton);

        // Add action listener to the button
        sendButton.addActionListener(new ActionListener()
         {
            @Override
            public void actionPerformed(ActionEvent e)
             {
                // Get the message from the text field
                String message = messageField.getText();
                if (!message.isEmpty())
                 {
                    // Display the message in the chat area
                    chatArea.append("You: " + message + "\n");
                    // Clear the message field
                    messageField.setText("");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
