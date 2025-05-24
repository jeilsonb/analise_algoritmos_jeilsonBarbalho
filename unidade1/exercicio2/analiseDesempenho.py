import random
import time

def main():
    # Preencher o vetor com valores aleatórios
    tamanho = 10000000
    vetor = [random.randint(0, 10000000) for _ in range(tamanho)]

    alvo = 33
    encontrado = False

    # Medir tempo de busca
    inicio = time.time()

    for i, valor in enumerate(vetor):
        if valor == alvo:
            print(f"\n{alvo} está na lista (posição: {i})")
            encontrado = True
            break

    if not encontrado:
        print(f"\n{alvo} não está na lista")

    fim = time.time()
    tempo_ms = (fim - inicio) * 1000
    print(f"Tempo de busca: {tempo_ms:.2f} ms \n")

if __name__ == "__main__":
    main()
