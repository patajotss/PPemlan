import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField idField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;
    private JButton submitButton;
    
    public RegistrationForm() {
        createForm();
    }
    
    private void createForm() {
        setTitle("Form Pendaftaran Mahasiswa Baru");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));
        
        JLabel nameLabel = new JLabel("Nama:");
        nameField = new JTextField();
        
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        
        JLabel phoneLabel = new JLabel("Telepon:");
        phoneField = new JTextField();
        
        JLabel addressLabel = new JLabel("Alamat:");
        addressField = new JTextField();
        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        
        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(addressLabel);
        add(addressField);
        add(new JLabel());
        add(submitButton);
    }
    
    private class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (nameField.getText().isEmpty() || idField.getText().isEmpty() ||
                emailField.getText().isEmpty() || phoneField.getText().isEmpty() ||
                addressField.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                int result = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                
                if (result == JOptionPane.OK_OPTION) {
                    showData();
                }
            }
        }
    }
    
    private void showData() {
        JFrame dataFrame = new JFrame("Data yang telah diisi");
        dataFrame.setSize(300, 300);
        dataFrame.setLayout(new GridLayout(5, 2));
        
        dataFrame.add(new JLabel("Nama:"));
        dataFrame.add(new JLabel(nameField.getText()));
        dataFrame.add(new JLabel("ID:"));
        dataFrame.add(new JLabel(idField.getText()));
        dataFrame.add(new JLabel("Email:"));
        dataFrame.add(new JLabel(emailField.getText()));
        dataFrame.add(new JLabel("Telepon:"));
        dataFrame.add(new JLabel(phoneField.getText()));
        dataFrame.add(new JLabel("Alamat:"));
        dataFrame.add(new JLabel(addressField.getText()));
        
        dataFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationForm form = new RegistrationForm();
            form.setVisible(true);
        });
    }
}
