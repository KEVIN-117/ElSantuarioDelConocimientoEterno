import matplotlib.pyplot as plt


def generate_labels():
    labels = ["A", "B", "C"]
    values = [20, 15, 50]
    fig, ax = plt.subplots()
    ax.pie(values, labels= labels)
    plt.show()