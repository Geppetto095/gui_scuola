
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Main {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Interfaccia Utente");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setLayout(new BorderLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                JButton studenteButton = new JButton("Studente");
                JButton professoreButton = new JButton("Professore");
                JPanel inputPanel = new JPanel();
                inputPanel.setLayout(new GridLayout(3, 2));
                JButton okButton = new JButton("OK");

                JTextField nomeField = new JTextField();
                JTextField cognomeField = new JTextField();
                JTextField mediaOrMateriaField = new JTextField();
                JLabel mediaOrMateriaLabel = new JLabel();

                studenteButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        inputPanel.removeAll();
                        inputPanel.add(new JLabel("Nome:"));
                        inputPanel.add(nomeField);
                        inputPanel.add(new JLabel("Cognome:"));
                        inputPanel.add(cognomeField);
                        mediaOrMateriaLabel.setText("Media:");
                        inputPanel.add(mediaOrMateriaLabel);
                        inputPanel.add(mediaOrMateriaField);
                        inputPanel.revalidate();
                        inputPanel.repaint();
                    }
                });

                professoreButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        inputPanel.removeAll();
                        inputPanel.add(new JLabel("Nome:"));
                        inputPanel.add(nomeField);
                        inputPanel.add(new JLabel("Cognome:"));
                        inputPanel.add(cognomeField);
                        mediaOrMateriaLabel.setText("Materia:");
                        inputPanel.add(mediaOrMateriaLabel);
                        inputPanel.add(mediaOrMateriaField);
                        inputPanel.revalidate();
                        inputPanel.repaint();
                    }
                });

                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nome = nomeField.getText();
                        String cognome = cognomeField.getText();
                        String mediaOrMateria = mediaOrMateriaField.getText();

                        if (mediaOrMateriaLabel.getText().equals("Media:")) {
                            JOptionPane.showMessageDialog(frame, "Studente:\nNome: " + nome + "\nCognome: " + cognome + "\nMedia: " + mediaOrMateria);
                        } else {
                            JOptionPane.showMessageDialog(frame, "Professore:\nNome: " + nome + "\nCognome: " + cognome + "\nMateria: " + mediaOrMateria);
                        }
                    }
                });

                panel.add(studenteButton);
                panel.add(professoreButton);
                panel.add(inputPanel);
                frame.add(panel, BorderLayout.CENTER);
                frame.add(okButton, BorderLayout.EAST);

                frame.setVisible(true);
            });
        }
    }

