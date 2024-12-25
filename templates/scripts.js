document.addEventListener('DOMContentLoaded', () => {
    const forms = document.querySelectorAll('form');
    forms.forEach(form => {
        form.addEventListener('submit', event => {
            event.preventDefault();
            const inputs = form.querySelectorAll('input');
            let isValid = true;

            inputs.forEach(input => {
                const errorMessage = input.nextElementSibling;
                if (!input.checkValidity()) {
                    errorMessage.textContent = `Please enter a valid ${input.placeholder.toLowerCase()}`;
                    errorMessage.style.display = 'block';
                    isValid = false;
                } else {
                    errorMessage.style.display = 'none';
                }
            });

            if (isValid) {
                alert('Form submitted successfully!');
            }
        });
    });
});
