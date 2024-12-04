const form = document.querySelector('form');
const hasilPrediksi = document.getElementById('hasilPrediksi');

form.addEventListener('submit', (event) => {
    event.preventDefault();
    const namaSaham = document.getElementById('namaSaham').value;
    const tanggalPrediksi = document.getElementById('tanggalPrediksi').value;

    // Kirim data ke server menggunakan fetch API atau library lain
    fetch('/prediksi', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            namaSaham,
            tanggalPrediksi
        })
    })
    .then(response => response.json())
    .then(data => {
        hasilPrediksi.textContent = `Hasil prediksi: ${data.hasil}`;
    })
    .catch(error => {
        console.error('Error:', error);
    });
});