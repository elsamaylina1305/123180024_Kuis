package nilaiMhs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class formmhs extends JFrame implements ActionListener{


    final JTextField textnim =new JTextField();
    final JTextField textnama= new JTextField();
    final JTextField textmatkul1 = new JTextField();
    final JTextField textnilai1= new JTextField();
    final JTextField textmatkul2= new JTextField();
    final JTextField textnilai2= new JTextField();
    final JLabel nim = new JLabel ("NIM");
    final JLabel nama = new JLabel ("Nama");
    final JLabel matkul1 = new JLabel ("Mata Kuliah 1");
    final JLabel nilai1 = new JLabel("Nilai1");
    final JLabel matkul2 = new JLabel("Mata Kuliah 2");
    final JLabel nilai2 = new JLabel("Nilai 2");
    double Rata;

    public formmhs(){
        setTitle("mata kuliah");
        JButton btnconvert = new JButton("convert");

        setLayout(null);
        add(btnconvert);
        btnconvert.addActionListener(this);
        add(nim);
        add(nama);
        add(matkul1);
        add(nilai1);
        add(matkul2);
        add(nilai2);
        add(textnim);
        add(textnama);
        add(textmatkul1);
        add(textnilai1);
        add(textmatkul2);
        add(textnilai2);

        nim.setBounds(10,20,100,20);
        nama.setBounds(10,40,100,20);
        matkul1.setBounds(10,60,100,20);
        nilai1.setBounds(10,80,100,20);
        matkul2.setBounds(10,100,100,20);
        nilai2.setBounds(10,120,100,20);
        textnim.setBounds(120,20,120,20);
        textnama.setBounds(120,40,120,20);
        textmatkul1.setBounds(120,60,120,20);
        textnilai1.setBounds(120,80,120,20);
        textmatkul2.setBounds(120,100,120,20);
        textnilai2.setBounds(120,120,120,20);

        btnconvert.setBounds(120,170,100,20);


        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);




    }
    public void actionPerformed(ActionEvent e) {//event handling
        try {//Exception handling(ketika data nilai di masukan huruf atau ada data kosong)
            double Nilai1 = Double.parseDouble(String.valueOf(textnilai1.getText()));
            double Nilai2 = Double.parseDouble(String.valueOf(textnilai2.getText()));
            String nama = textnama.getText();
            String nim = textnim.getText();
            String matkul1 = textmatkul1.getText();
            String matkul2 = textmatkul2.getText();


            new nilai(nim, nama, matkul1, matkul2, Nilai1, Nilai2);
        }catch (Exception salah){
            System.err.println("anda salah memasukan tipe data nilai atau data kosong");
        }
    }


}

